package stdgui.data.model.modelwrapper;


    
    


     

public class TargetComponentRefWrapper {

    
    
    private TargetComponentRef targetComponentRef;

    public TargetComponentRefWrapper(TargetComponentRef targetComponentRef) {
        this.targetComponentRef = targetComponentRef;
    }

   
    public SwComponentPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetComponentRef.getDest())) {
            
            return targetComponentRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetComponentRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetComponentRef.getValue();
        java.lang.String type = targetComponentRef.getDest().toString().replace("_", "-");
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

    
    public SwComponentPrototypeWrapper getSwComponentPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetComponentRef.getValue();
        java.lang.String type = targetComponentRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwComponentPrototype){
            return new SwComponentPrototypeWrapper((SwComponentPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}