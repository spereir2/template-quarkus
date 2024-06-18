package com.shaunpereira;

import java.util.List;

import io.apicurio.api.beans.ProductOffering;
import io.apicurio.api.beans.ProductOfferingPrice;
import io.apicurio.api.beans.ProductSpecification;
import io.apicurio.api.beans.ProvisioningSpecification;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/product-catalog")
public class ProducCatalogResource implements BshResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @Override
    public List<ProductOffering> generatedMethod1(@NotNull String accountId, String id, String fields, String category,
            Integer limit, String name, Integer offset) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generatedMethod1'");
    }

    @Override
    public ProductOffering generatedMethod2(@NotNull String accountId, String id, String fields) {
        // TODO Auto-generated method stub
        ProductOffering myProductOffering  = new ProductOffering();
        return myProductOffering;
        //throw new UnsupportedOperationException("Unimplemented method 'generatedMethod2'");
    }

    @Override
    public List<ProductOfferingPrice> generatedMethod3(@NotNull String accountId, String id, String fields,
            Integer limit, String name, Integer offset) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generatedMethod3'");
    }

    @Override
    public ProductOfferingPrice generatedMethod4(@NotNull String accountId, @NotNull String characteristicName,
            @NotNull String characteristicValue, String fields, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generatedMethod4'");
    }

    @Override
    public List<ProductSpecification> generatedMethod5(@NotNull String accountId, String id, String fields,
            String brand, Integer limit, String name, Integer offset) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generatedMethod5'");
    }

    @Override
    public ProductSpecification generatedMethod6(@NotNull String accountId, String fields, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generatedMethod6'");
    }

    @Override
    public List<ProvisioningSpecification> generatedMethod7(@NotNull String accountId, String fields, String action,
            String provisionCategory, String vendor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generatedMethod7'");
    }
}
