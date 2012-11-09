package com.dooapp.firea.entity.repositories;

import com.dooapp.firea.entity.repositories.criteria.FolderCriteria;
import java.util.List;
import com.dooapp.firea.entity.domain.Folder;

//Start of user code for imports
// TODO: import me!
//End of user code

//


public interface FolderRepository 
{

	public List<Folder> findAll () ;
	public List<Folder> findByCriteria (FolderCriteria folderCriteria) ;
	public Folder findById (Long id) ;
	public Folder save (Folder folder) ;

}
