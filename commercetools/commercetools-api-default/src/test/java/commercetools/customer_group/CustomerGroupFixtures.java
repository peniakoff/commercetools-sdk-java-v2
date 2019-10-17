package commercetools.customer_group;

import com.commercetools.api.generated.models.customer_group.CustomerGroup;
import com.commercetools.api.generated.models.customer_group.CustomerGroupDraft;
import com.commercetools.api.generated.models.customer_group.CustomerGroupDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CustomerGroupFixtures {
    
    public static void withCustomerGroup(final Consumer<CustomerGroup> consumer) {
        CustomerGroup customerGroup = createCustomerGroup();
        consumer.accept(customerGroup);
        deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion());
    }
    
    public static void withUpdateableCustomerGroup(final UnaryOperator<CustomerGroup> operator) {
        CustomerGroup customerGroup = createCustomerGroup();
        customerGroup = operator.apply(customerGroup);
        deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion());
    }
    
    public static CustomerGroup createCustomerGroup() {
        CustomerGroupDraft customerGroupDraft = CustomerGroupDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .groupName(CommercetoolsTestUtils.randomString())
                .build();
        
        CustomerGroup customerGroup = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customerGroups()
                .post(customerGroupDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(customerGroup);
        Assert.assertEquals(customerGroup.getKey(), customerGroupDraft.getKey());
        
        return customerGroup;
    }
    
    public static CustomerGroup deleteCustomerGroup(final String id, final Long version) {
        CustomerGroup customerGroup = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customerGroups()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(customerGroup);
        Assert.assertEquals(customerGroup.getId(), id);
        
        return customerGroup;
    }
    
}