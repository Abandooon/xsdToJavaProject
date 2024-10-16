package stdgui.data.model.modelwrapper;


    
    


     

public class SoftwareMemorySectionRefWrapper {

    
    
    private SoftwareMemorySectionRef softwareMemorySectionRef;

    public SoftwareMemorySectionRefWrapper(SoftwareMemorySectionRef softwareMemorySectionRef) {
        this.softwareMemorySectionRef = softwareMemorySectionRef;
    }

   
    public MemorySectionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(softwareMemorySectionRef.getDest())) {
            
            return softwareMemorySectionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSoftwareMemorySectionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = softwareMemorySectionRef.getValue();
        java.lang.String type = softwareMemorySectionRef.getDest().toString().replace("_", "-");
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

    
    public MemorySectionWrapper getMemorySection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = softwareMemorySectionRef.getValue();
        java.lang.String type = softwareMemorySectionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MemorySection){
            return new MemorySectionWrapper((MemorySection) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}