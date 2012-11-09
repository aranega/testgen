package com.dooapp.firea.entity.services;

import java.util.List;
import com.dooapp.firea.entity.domain.Folder;
import com.dooapp.firea.entity.repositories.criteria.FolderCriteria;
import org.springframework.transaction.annotation.Transactional;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface FolderService 
{

	public List<Folder> findAll () ;
	public List<Folder> findByCriteria (FolderCriteria criteria) ;
	public Folder findById (Long id) ;
	public Folder save (Folder folder) ;

}
