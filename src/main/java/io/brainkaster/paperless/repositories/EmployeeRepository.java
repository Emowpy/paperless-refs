package io.brainkaster.paperless.repositories;

import io.brainkaster.paperless.referentiel.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by melbakkali on 06/04/2016.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
