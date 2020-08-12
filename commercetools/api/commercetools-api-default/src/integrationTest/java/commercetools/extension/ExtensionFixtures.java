package commercetools.extension;

import com.commercetools.api.models.extension.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ExtensionFixtures {

    public static void withExtension(final Consumer<Extension> consumer) {
        Extension extension = createExtension();
        consumer.accept(extension);
        deleteExtension(extension.getId(), extension.getVersion());
    }

    public static void withUpdateableExtension(final UnaryOperator<Extension> operator) {
        Extension extension = createExtension();
        extension = operator.apply(extension);
        deleteExtension(extension.getId(), extension.getVersion());
    }

    public static Extension createExtension() {
        ExtensionDraft extensionDraft = ExtensionDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .destination(ExtensionHttpDestinationBuilder.of().url("http://www.commercetools.com").build())
                .triggers(Arrays.asList(ExtensionTriggerBuilder.of()
                        .resourceTypeId(ExtensionResourceTypeId.CART)
                        .actions(Arrays.asList(ExtensionAction.CREATE))
                        .build()))
                .build();

        Extension extension = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .extensions()
                .post(extensionDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(extension);
        Assert.assertEquals(extension.getKey(), extensionDraft.getKey());

        return extension;
    }

    public static Extension deleteExtension(final String id, final Long version) {
        Extension extension = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .extensions()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(extension);
        Assert.assertEquals(extension.getId(), id);

        return extension;
    }

}