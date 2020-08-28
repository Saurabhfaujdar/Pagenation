package org.TD.SaurabhHiring.ServiceImplementation;

import org.TD.SaurabhHiring.DTO.ProblemDTO;
import org.TD.SaurabhHiring.IO.Dao.DAO;
//import org.TD.SaurabhHiring.IO.Dao.Impl.MySQLDao;
import org.TD.SaurabhHiring.Service.ProblemService;
import org.TD.SaurabhHiring.Utils.ProblemUtils;

import java.util.List;

public class ProblemServiceImpl implements ProblemService {

    DAO database;
    ProblemUtils problemUtils = new ProblemUtils();

    public ProblemServiceImpl() {
        //this.database = new MySQLDao();
    }

    public ProblemDTO createProblem(ProblemDTO problem) {
        ProblemDTO returnValue = new ProblemDTO();
        ProblemDTO existingProblem = this.getProblemByProblemName(problem.getProblemName());
        if (existingProblem != null) {
            throw new RuntimeException();
        }

        String problemId = problemUtils.generateProblemId(30);
        problem.setProblemId(problemId);

        returnValue = this.saveProblem(problem);

        return returnValue;
    }

    private ProblemDTO saveProblem(ProblemDTO problem) {
        ProblemDTO returnValue = null;
        // Connect to database
        try {
            this.database.openConnection();
            returnValue = this.database.saveProblem(problem);
        } finally {
            this.database.closeConnection();
        }

        return returnValue;
    }

    /*public ProblemDTO getProblem(String id) {
        ProblemDTO returnValue = null;
        try {
            this.database.openConnection();
            return this.database.getProblem(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ErrorMessages.ERR_EMPTY_GROUP_NAME);
        } finally {
            this.database.closeConnection();
        }
        return returnValue;
    }*/

    public ProblemDTO getProblemByProblemName(String problemName) {
        ProblemDTO problemDTO = null;

        if (problemName == null || problemName.isEmpty()) {
            return problemDTO;
        }

        // Connect to database
        try {
            this.database.openConnection();
            problemDTO = this.database.getProblemByProblemName(problemName);
        } finally {
            this.database.closeConnection();
        }

        return problemDTO;
    }


/*    @Override
    public List<ProblemDTO> getProblems(int start, int limit) {
        List<ProblemDTO> problems = null;

        // Get users from database
        try {
            this.database.openConnection();
            problems = this.database.getProblems(start, limit);
        } finally {
            this.database.closeConnection();
        }

        return problems;
    }

    public void updateProblemDetails(ProblemDTO problemDetails) {
        try {
            // Connect to database
            this.database.openConnection();
            // Update User Details
            this.database.updateProblem(problemDetails);

        } catch (Exception ex) {
            throw new CouldNotUpdateRecordException(ex.getMessage());
        } finally {
            this.database.closeConnection();
        }
    }

    public void deleteProblem(ProblemDTO problemDto) {
        try {
            this.database.openConnection();
            this.database.deleteUser(userDto);
        } catch (Exception ex) {
            throw new CouldNotDeleteRecordException(ex.getMessage());
        } finally {
            this.database.closeConnection();
        }

        // Verify that user is deleted
        try {
            problemDto = getUser(problemDto.getProblemId());
        } catch (NoRecordFoundException ex) {
            problemDto = null;
        }

        if (problemDto != null) {
            throw new CouldNotDeleteRecordException(
                    ErrorMessages.COULD_NOT_DELETE_RECORD.getErrorMessage());
        }
    }*/
}
