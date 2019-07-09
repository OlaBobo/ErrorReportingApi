package pl.akademiakodu.reporting.repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.reporting.model.Report;

public interface ReportRepository extends
        CrudRepository<Report, Integer> {

}