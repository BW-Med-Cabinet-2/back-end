package com.matiasiturbide.medicinecabinet.repository;

import com.matiasiturbide.medicinecabinet.models.Useremail;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Useremail to the rest of the application
 */
public interface UseremailRepository
        extends CrudRepository<Useremail, Long>
{
}
