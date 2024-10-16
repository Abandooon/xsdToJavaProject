package stdgui.data.model.modelwrapper;


    
    


     

public class SecondPortRefWrapper {

    
    
    private SecondPortRef secondPortRef;

    public SecondPortRefWrapper(SecondPortRef secondPortRef) {
        this.secondPortRef = secondPortRef;
    }

   
    public CouplingPortSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(secondPortRef.getDest())) {
            
            return secondPortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSecondPortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = secondPortRef.getValue();
        java.lang.String type = secondPortRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = secondPortRef.getValue();
        java.lang.String type = secondPortRef.getDest().toString().replace("_", "-");
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