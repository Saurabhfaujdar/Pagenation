package org.TD.SaurabhHiring.Service;

import org.TD.SaurabhHiring.DTO.ProblemDTO;

import java.util.List;

public interface ProblemService {
    ProblemDTO createProblem(ProblemDTO problem);
    //ProblemDTO getProblem(String id);
    ProblemDTO getProblemByProblemName(String ProblemName);
    //List<ProblemDTO> getProblems(int start, int limit);
    //void updateProblemDetails(ProblemDTO ProblemDetails);
    //void deleteProblem(ProblemDTO ProblemDto);
}
