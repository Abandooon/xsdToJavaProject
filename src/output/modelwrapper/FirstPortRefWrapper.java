package stdgui.data.model.modelwrapper;


    
    


     

public class FirstPortRefWrapper {

    
    
    private FirstPortRef firstPortRef;

    public FirstPortRefWrapper(FirstPortRef firstPortRef) {
        this.firstPortRef = firstPortRef;
    }

   
    public CouplingPortSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(firstPortRef.getDest())) {
            
            return firstPortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFirstPortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = firstPortRef.getValue();
        java.lang.String type = firstPortRef.getDest().toString().replace("_", "-");
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

    
    public CouplingPortWrapper getCouplingPort() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = firstPortRef.getValue();
        java.lang.String type = firstPortRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPort){
            return new CouplingPortWrapper((CouplingPort) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}