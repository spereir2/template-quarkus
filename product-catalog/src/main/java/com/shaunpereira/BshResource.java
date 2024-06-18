package com.shaunpereira;

import io.apicurio.api.beans.ProductOffering;
import io.apicurio.api.beans.ProductOfferingPrice;
import io.apicurio.api.beans.ProductSpecification;
import io.apicurio.api.beans.ProvisioningSpecification;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import java.util.List;

/**
 * A JAX-RS interface. An implementation of this interface must be provided.
 */
@Path("/bsh-v1")
public interface BshResource {
  @Path("/productCatalogManagement/v5/productOffering")
  @GET
  @Produces("application/json")
  List<ProductOffering> generatedMethod1(@QueryParam("accountId") @NotNull String accountId,
      @QueryParam("id") String id, @QueryParam("fields") String fields, @QueryParam("category") String category,
      @QueryParam("limit") Integer limit, @QueryParam("name") String name, @QueryParam("offset") Integer offset);

  @Path("/productCatalogManagement/v5/productOffering/{id}")
  @GET
  @Produces("application/json")
  ProductOffering generatedMethod2(@QueryParam("accountId") @NotNull String accountId, @PathParam("id") String id,
      @QueryParam("fields") String fields);

  @Path("/productCatalogManagement/v5/productOfferingPrice")
  @GET
  @Produces("application/json")
  List<ProductOfferingPrice> generatedMethod3(@QueryParam("accountId") @NotNull String accountId,
      @QueryParam("id") String id, @QueryParam("fields") String fields, @QueryParam("limit") Integer limit,
      @QueryParam("name") String name, @QueryParam("offset") Integer offset);

  @Path("/productCatalogManagement/v5/productOfferingPrice/{id}")
  @GET
  @Produces("application/json")
  ProductOfferingPrice generatedMethod4(@QueryParam("accountId") @NotNull String accountId,
      @QueryParam("characteristic.name") @NotNull String characteristicName,
      @QueryParam("characteristic.value") @NotNull String characteristicValue, @QueryParam("fields") String fields,
      @PathParam("id") String id);

  @Path("/productCatalogManagement/v5/productSpecification")
  @GET
  @Produces("application/json")
  List<ProductSpecification> generatedMethod5(@QueryParam("accountId") @NotNull String accountId,
      @QueryParam("id") String id, @QueryParam("fields") String fields, @QueryParam("brand") String brand,
      @QueryParam("limit") Integer limit, @QueryParam("name") String name, @QueryParam("offset") Integer offset);

  @Path("/productCatalogManagement/v5/productSpecification/{id}")
  @GET
  @Produces("application/json")
  ProductSpecification generatedMethod6(@QueryParam("accountId") @NotNull String accountId,
      @QueryParam("fields") String fields, @PathParam("id") String id);

  @Path("/productCatalogManagement/v5/serviceSpecification/{vendor}/{provisionCategory}/{action}")
  @GET
  @Produces("application/json")
  List<ProvisioningSpecification> generatedMethod7(@QueryParam("accountId") @NotNull String accountId,
      @QueryParam("fields") String fields, @PathParam("action") String action,
      @PathParam("provisionCategory") String provisionCategory, @PathParam("vendor") String vendor);
}
