package io.phasetwo.client.openapi.api;

import io.phasetwo.client.openapi.model.InvitationRepresentation;
import io.phasetwo.client.openapi.model.InvitationRequestRepresentation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/{realm}/orgs/{orgId}/invitations")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface OrganizationInvitationsApi {

    @POST
    @Consumes({ "application/json" })
    Response addOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,InvitationRequestRepresentation invitationRequestRepresentation);

    @GET
    @Produces({ "application/json" })
    List<InvitationRepresentation> getOrganizationInvitations(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@QueryParam("search")   String search,@QueryParam("first")   Integer first,@QueryParam("max")   Integer max);

    @DELETE
    @Path("/{invitationId}")
    void removeOrganizationInvitation(@PathParam("realm") String realm,@PathParam("orgId") String orgId,@PathParam("invitationId") String invitationId);
}
