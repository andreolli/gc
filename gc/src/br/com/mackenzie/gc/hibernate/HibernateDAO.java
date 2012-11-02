package br.com.mackenzie.gc.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;

public class HibernateDAO {	
	
    private Class classe;   
    protected Session session;   
       
    public HibernateDAO(){              	
    	//this.classe = (Class<T>) (getClass().getGenericSuperclass()).getClass().getActualTypeArguments()[0];    	
    }   
       
    protected Session getSession(){   
        if(this.session == null || !this.session.isOpen()){   
        	this.session = HibernateUtil.getSession();   
        }   
        return this.session;   
    }   
       
    public void save(Object t){
    	getSession().beginTransaction();   
        getSession().save(t);        
        getSession().getTransaction().commit();
        getSession().close();		     
    }   
       
    public void delete(Object t){   
        getSession().beginTransaction();   
        getSession().delete(t);
        getSession().getTransaction().commit();
        getSession().close();   
    }                                                                
       
    public void update(Object t){   
        getSession().beginTransaction();   
        getSession().update(t);
        getSession().getTransaction().commit();
        getSession().close();   
    }   
       
    public List<Object> findAll(Object t){   
        //return getSession().createCriteria(this.classe).list();        
    	return getSession().createCriteria(this.classe).list();    	
    }   
       
         /**  
     * Metodo responsavel por recuperar todos os objetos de uma tabela da base de dados de acordo  
     * com o exemplo passado.  
     *  
     * @param filtro  
     * @param matchMode  
     * @param ignoreCase  
     * @return lista  
     */   
    public List<Object> findByExample(Object filtro, MatchMode matchMode, boolean ignoreCase){   
        org.hibernate.criterion.Example example = org.hibernate.criterion.Example.create(filtro);   
  
        if(matchMode != null){   
            example = example.enableLike(matchMode);   
        }  
        if(ignoreCase){   
            example = example.ignoreCase();   
        }    
        return getSession().createCriteria(this.classe).add(example).list();   
    }
}