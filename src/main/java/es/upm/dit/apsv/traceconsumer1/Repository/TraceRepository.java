package es.upm.dit.apsv.traceconsumer1.Repository;

import org.springframework.data.repository.CrudRepository;
import es.upm.dit.apsv.traceconsumer1.model.Trace;

public interface TraceRepository extends CrudRepository<Trace,String> {
}

