package org.TD.SaurabhHiring.IO.Dao;

import org.TD.SaurabhHiring.DTO.ProblemDTO;

import java.util.List;

public interface DAO {

    void openConnection();
    ProblemDTO getProblemByProblemName(String problemName);
    ProblemDTO getProblemByAuthorName(String authorNAme);
    ProblemDTO saveProblem(ProblemDTO problem);
    ProblemDTO getProblem(String id);
    List<ProblemDTO> getProblems(int start, int limit);
    void updateProblem(ProblemDTO problem);
    void deleteProblem(ProblemDTO problem);
    void closeConnection();
}
