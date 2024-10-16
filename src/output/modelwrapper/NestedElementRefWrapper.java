package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class NestedElementRefWrapper {

    
    
    private NestedElementRef nestedElementRef;

    public NestedElementRefWrapper(NestedElementRef nestedElementRef) {
        this.nestedElementRef = nestedElementRef;
    }

   
    public EocExecutableEntityRefAbstractSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(nestedElementRef.getDest())) {
            
            return nestedElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getNestedElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = nestedElementRef.getValue();
        java.lang.String type = nestedElementRef.getDest().toString().replace("_", "-");
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

    
    public EocEventRefWrapper getEocEventRef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nestedElementRef.getValue();
        java.lang.String type = nestedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocEventRef){
            return new EocEventRefWrapper((EocEventRef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EocExecutableEntityRefWrapper getEocExecutableEntityRef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nestedElementRef.getValue();
        java.lang.String type = nestedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocExecutableEntityRef){
            return new EocExecutableEntityRefWrapper((EocExecutableEntityRef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EocExecutableEntityRefGroupWrapper getEocExecutableEntityRefGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nestedElementRef.getValue();
        java.lang.String type = nestedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocExecutableEntityRefGroup){
            return new EocExecutableEntityRefGroupWrapper((EocExecutableEntityRefGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}