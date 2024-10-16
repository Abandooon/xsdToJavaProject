package stdgui.data.model.modelwrapper;


    
    


     

public class OffsetTimeDomainRefWrapper {

    
    
    private OffsetTimeDomainRef offsetTimeDomainRef;

    public OffsetTimeDomainRefWrapper(OffsetTimeDomainRef offsetTimeDomainRef) {
        this.offsetTimeDomainRef = offsetTimeDomainRef;
    }

   
    public GlobalTimeDomainSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(offsetTimeDomainRef.getDest())) {
            
            return offsetTimeDomainRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getOffsetTimeDomainRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = offsetTimeDomainRef.getValue();
        java.lang.String type = offsetTimeDomainRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        java.lang.String className = schemaController.convertClassName(type);
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        java.lang.String wrapperClassName = "" + className + "Wrapper";
        Class<?> wrapperClass = Class.forName(wrapperClassName);
        Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
        Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
        return wrapperInstance;
    }

    
    public GlobalTimeDomainWrapper getGlobalTimeDomain() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = offsetTimeDomainRef.getValue();
        java.lang.String type = offsetTimeDomainRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeDomain){
            return new GlobalTimeDomainWrapper((GlobalTimeDomain) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}