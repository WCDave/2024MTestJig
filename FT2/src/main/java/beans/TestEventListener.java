package beans;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.AutoFlushEvent;
import org.hibernate.event.AutoFlushEventListener;
import org.hibernate.event.DeleteEvent;
import org.hibernate.event.DeleteEventListener;
import org.hibernate.event.DirtyCheckEvent;
import org.hibernate.event.DirtyCheckEventListener;
import org.hibernate.event.FlushEntityEvent;
import org.hibernate.event.FlushEntityEventListener;
import org.hibernate.event.FlushEvent;
import org.hibernate.event.FlushEventListener;
import org.hibernate.event.Initializable;
import org.hibernate.event.LoadEvent;
import org.hibernate.event.LoadEventListener;
import org.hibernate.event.LockEvent;
import org.hibernate.event.LockEventListener;
import org.hibernate.event.MergeEvent;
import org.hibernate.event.MergeEventListener;
import org.hibernate.event.PostCollectionRecreateEvent;
import org.hibernate.event.PostCollectionRecreateEventListener;
import org.hibernate.event.PostCollectionRemoveEvent;
import org.hibernate.event.PostCollectionRemoveEventListener;
import org.hibernate.event.PostCollectionUpdateEvent;
import org.hibernate.event.PostCollectionUpdateEventListener;
import org.hibernate.event.PostDeleteEvent;
import org.hibernate.event.PostDeleteEventListener;
import org.hibernate.event.PostInsertEvent;
import org.hibernate.event.PostInsertEventListener;
import org.hibernate.event.PostLoadEvent;
import org.hibernate.event.PostLoadEventListener;
import org.hibernate.event.PostUpdateEvent;
import org.hibernate.event.PostUpdateEventListener;
import org.hibernate.event.PreCollectionRecreateEvent;
import org.hibernate.event.PreCollectionRecreateEventListener;
import org.hibernate.event.PreCollectionRemoveEvent;
import org.hibernate.event.PreCollectionRemoveEventListener;
import org.hibernate.event.PreCollectionUpdateEvent;
import org.hibernate.event.PreCollectionUpdateEventListener;
import org.hibernate.event.PreDeleteEvent;
import org.hibernate.event.PreDeleteEventListener;
import org.hibernate.event.PreInsertEvent;
import org.hibernate.event.PreInsertEventListener;
import org.hibernate.event.PreLoadEvent;
import org.hibernate.event.PreLoadEventListener;
import org.hibernate.event.PreUpdateEvent;
import org.hibernate.event.PreUpdateEventListener;
import org.hibernate.event.RefreshEvent;
import org.hibernate.event.RefreshEventListener;
import org.hibernate.event.ReplicateEvent;
import org.hibernate.event.ReplicateEventListener;
import org.hibernate.event.SaveOrUpdateEvent;
import org.hibernate.event.SaveOrUpdateEventListener;
import org.hibernate.mapping.JoinedSubclass;
import org.hibernate.mapping.PersistentClass;

import domain.annotations.RelatedEntities;

public class TestEventListener implements  AutoFlushEventListener,
		DeleteEventListener, DirtyCheckEventListener, FlushEntityEventListener,
		FlushEventListener, LoadEventListener, LockEventListener,
		MergeEventListener, PostCollectionRecreateEventListener,
		PostCollectionRemoveEventListener, PostCollectionUpdateEventListener,
		PostDeleteEventListener, PostInsertEventListener,
		PostLoadEventListener, PostUpdateEventListener,
		PreCollectionRecreateEventListener, PreCollectionRemoveEventListener,
		PreCollectionUpdateEventListener, PreDeleteEventListener,
		PreInsertEventListener, PreLoadEventListener, PreUpdateEventListener,
		RefreshEventListener, ReplicateEventListener, SaveOrUpdateEventListener, Initializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6802847586582329453L;

	private  static final Logger log = Logger
	.getLogger(TestEventListener.class);
	
	private Configuration cfg;
	



	
	public void onAutoFlush(AutoFlushEvent arg0) throws HibernateException {
		log.debug("onAutoFlush");

	}

	
	public void onDelete(DeleteEvent arg0) throws HibernateException {
		log.debug("onDelete1");

	}

	
	public void onDelete(DeleteEvent arg0, Set arg1) throws HibernateException {
		log.debug("onDelete2");

	}

	
	public void onDirtyCheck(DirtyCheckEvent arg0) throws HibernateException {
		log.debug("onDirtyCheck");

	}

	
	public void onFlushEntity(FlushEntityEvent arg0) throws HibernateException {
		log.debug("onFlushEntity");

	}

	
	public void onFlush(FlushEvent arg0) throws HibernateException {
		log.debug("onFlush");

	}

	
	public void onLoad(LoadEvent arg0, LoadType arg1) throws HibernateException {
		log.debug("onLoad");

	}

	
	public void onLock(LockEvent arg0) throws HibernateException {
		log.debug("onLock");

	}

	
	public void onMerge(MergeEvent arg0) throws HibernateException {
		log.debug("onMerge");

	}

	
	public void onMerge(MergeEvent arg0, Map arg1) throws HibernateException {
		log.debug("onMerge");

	}

	
	public void onPostRecreateCollection(PostCollectionRecreateEvent arg0) {
		log.debug("onPostRecreateCollection");

	}

	
	public void onPostRemoveCollection(PostCollectionRemoveEvent arg0) {
		log.debug("onPostRemoveCollection");

	}

	
	public void onPostUpdateCollection(PostCollectionUpdateEvent arg0) {
		log.debug("onPostUpdateCollection");

	}

	
	public void onPostDelete(PostDeleteEvent arg0) {
		log.debug("onPostDelete");

	}

	
	public void onPostInsert(PostInsertEvent arg0) {
		log.debug("onPostInsert");
		Object entity = arg0.getEntity();
		PersistentClass pClass = cfg.getClassMapping(entity.getClass().getName());
		if(pClass instanceof JoinedSubclass)
		{
			JoinedSubclass jsc = (JoinedSubclass)pClass;
			PersistentClass sClass = cfg.getClassMapping(pClass.getSuperclass().getClassName());
			String keyName = sClass.getIdentifierProperty().getName();
			try {
				String className = entity.getClass().getSuperclass().getName();
				Class<?> clazz = Class.forName(className);
				Field[] fields = clazz.getDeclaredFields();
				fields[0].setAccessible(true);
				Object o = fields[0].get(entity);
				
				int jjj=9;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int jj=0;
		}
		int h=8;
	}

	
	public void onPostLoad(PostLoadEvent arg0) {
		log.debug("onPostLoad");

	}

	
	public void onPostUpdate(PostUpdateEvent arg0) {
		log.debug("onPostUpdate");

	}

	
	public void onPreRecreateCollection(PreCollectionRecreateEvent arg0) {
		log.debug("onPreRecreateCollection");

	}

	
	public void onPreRemoveCollection(PreCollectionRemoveEvent arg0) {
		log.debug("onPreRemoveCollection");

	}

	
	public void onPreUpdateCollection(PreCollectionUpdateEvent arg0) {
		log.debug("onPreUpdateCollection");

	}

	
	public boolean onPreDelete(PreDeleteEvent arg0) {
		Object entity = arg0.getEntity();
		
		if(entity.getClass().isAnnotationPresent(RelatedEntities.class))
		{
			log.debug("********got an annotation*****************");
			RelatedEntities re = entity.getClass().getAnnotation(RelatedEntities.class);
			for(int i=0;i<re.entities().length;i++)
			{
				log.debug("Rel Entity="+re.entities()[i]+", key="+re.keys()[i]);
			}
		}
		log.debug("onPreDelete");
		return false;
	}

	
	public boolean onPreInsert(PreInsertEvent arg0) {
		log.debug("onPreInsert");
		return false;
	}

	
	public void onPreLoad(PreLoadEvent arg0) {
		log.debug("onPreLoad");

	}

	
	public boolean onPreUpdate(PreUpdateEvent arg0) {
		log.debug("onPreUpdate");
		return false;
	}

	
	public void onRefresh(RefreshEvent arg0) throws HibernateException {
		log.debug("onRefresh1");

	}

	
	public void onRefresh(RefreshEvent arg0, Map arg1)
			throws HibernateException {
		log.debug("onRefresh2");

	}

	
	public void onReplicate(ReplicateEvent arg0) throws HibernateException {
		log.debug("onReplicate");

	}

	
	public void onSaveOrUpdate(SaveOrUpdateEvent arg0)
			throws HibernateException {
		log.debug("onSaveOrUpdate");

	}

	
	public void initialize(Configuration arg0) {
		cfg = arg0;
		
	}

}
