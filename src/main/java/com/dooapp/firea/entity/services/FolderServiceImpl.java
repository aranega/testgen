package com.dooapp.firea.entity.services;

import com.dooapp.firea.entity.repositories.criteria.FolderCriteria;
import com.dooapp.firea.entity.repositories.FolderRepository;
import com.dooapp.firea.entity.domain.Folder;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Service(value = "folderService")
@Transactional(readOnly = true)
public class FolderServiceImpl implements FolderService
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@Autowired
	private FolderRepository folderRepository;
    

	public List<Folder> findAll () 
	{
		return this.folderRepository.findAll();	
	}

	public List<Folder> findByCriteria (FolderCriteria criteria) 
	{
		return this.folderRepository.findByCriteria (criteria);	
	}

	public Folder findById (Long id) 
	{
		return this.folderRepository.findById(id);	
	}

	public Folder save (Folder folder) 
	{
		return this.folderRepository.save (folder);	
	}


}
