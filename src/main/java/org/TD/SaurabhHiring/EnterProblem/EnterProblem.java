package org.TD.SaurabhHiring.EnterProblem;

import org.TD.SaurabhHiring.DTO.ProblemDTO;
import org.TD.SaurabhHiring.Service.ProblemService;
import org.TD.SaurabhHiring.ServiceImplementation.ProblemServiceImpl;
import org.TD.SaurabhHiring.models.CreateProblemRequestModel;
import org.TD.SaurabhHiring.models.CreateProblemResponseModel;
import org.springframework.beans.BeanUtils;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class EnterProblem {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON,  MediaType.APPLICATION_XML} )
    public CreateProblemResponseModel createProblem(CreateProblemRequestModel requestObject) {
        CreateProblemResponseModel returnValue = new CreateProblemResponseModel();

       // Prepare UserDTO
        ProblemDTO problemDto = new ProblemDTO();
        BeanUtils.copyProperties(requestObject, problemDto);

        // Create new Problem
        ProblemService userService = new ProblemServiceImpl();
        ProblemDTO createdProblem = userService.createProblem(problemDto);

        //Prepare response
        BeanUtils.copyProperties(createdProblem, returnValue);

        return returnValue;
    }
}
