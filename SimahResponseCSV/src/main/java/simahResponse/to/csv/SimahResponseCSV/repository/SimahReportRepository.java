package simahResponse.to.csv.SimahResponseCSV.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import simahResponse.to.csv.SimahResponseCSV.model.SimahReport;

@Repository
public interface SimahReportRepository extends CrudRepository<SimahReport, String> {

	
	
}
