package stdgui.data.model.modelwrapper;


    
    


     

public class ArgumentRefWrapper {

    
    
    private ArgumentRef argumentRef;

    public ArgumentRefWrapper(ArgumentRef argumentRef) {
        this.argumentRef = argumentRef;
    }

   
    public ArgumentDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(argumentRef.getDest())) {
            
            return argumentRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getArgumentRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = argumentRef.getValue();
        java.lang.String type = argumentRef.getDest().toString().replace("_", "-");
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

    
    public ArgumentDataPrototypeWrapper getArgumentDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = argumentRef.getValue();
        java.lang.String type = argumentRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArgumentDataPrototype){
            return new ArgumentDataPrototypeWrapper((ArgumentDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}