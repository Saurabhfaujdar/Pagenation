/*package org.TD.SaurabhHiring.IO.Dao.Impl;

import org.TD.SaurabhHiring.DTO.ProblemDTO;
import org.TD.SaurabhHiring.IO.Dao.DAO;
import org.TD.SaurabhHiring.IO.Entity.ProblemEntity;
import org.TD.SaurabhHiring.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class MySQLDao implements DAO {

    Session session;

    public void openConnection() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        session = sessionFactory.openSession();
    }
    public ProblemDTO getProblemByProblemName(String problemName) {

        ProblemDTO problemDto = null;

        CriteriaBuilder cb = session.getCriteriaBuilder();

        //Create Criteria against a particular persistent class
        CriteriaQuery<ProblemEntity> criteria = cb.createQuery(ProblemEntity.class);

        //Query roots always reference entities
        Root<ProblemEntity> profileRoot = criteria.from(ProblemEntity.class);
        criteria.select(profileRoot);
        criteria.where(cb.equal(profileRoot.get("problem_name"), problemName));

        // Fetch single result
        Query<ProblemEntity> query = session.createQuery(criteria);
        List<ProblemEntity> resultList = query.getResultList();
        if (resultList != null && resultList.size() > 0) {
            ProblemEntity problemEntity = resultList.get(0);
            problemDto = new ProblemDTO();
            BeanUtils.copyProperties(problemEntity, problemDto);
        }

        return problemDto;
    }

    @Override
    public ProblemDTO getProblemByAuthorName(String authorNAme) {
        return null;
    }

    @Override
    public ProblemDTO saveProblem(ProblemDTO problem) {
        ProblemDTO returnValue = null;
        ProblemEntity problemEntity = new ProblemEntity();
        BeanUtils.copyProperties(problem, problemEntity);

        session.beginTransaction();
        session.save(problemEntity);
        session.getTransaction().commit();

        returnValue = new ProblemDTO();
        BeanUtils.copyProperties(problemEntity, returnValue);

        return returnValue;
    }

    @Override
    public ProblemDTO getProblem(String id) {
        return null;
    }

    @Override
    public List<ProblemDTO> getProblems(int start, int limit) {
        return null;
    }

    @Override
    public void updateProblem(ProblemDTO problem) {

    }

    @Override
    public void deleteProblem(ProblemDTO problem) {

    }

    @Override
    public void closeConnection() {
        if (session != null) {
            session.close();
        }
    }
}*/
