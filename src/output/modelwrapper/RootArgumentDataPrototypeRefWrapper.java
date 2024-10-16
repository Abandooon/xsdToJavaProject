package stdgui.data.model.modelwrapper;


    
    


     

public class RootArgumentDataPrototypeRefWrapper {

    
    
    private RootArgumentDataPrototypeRef rootArgumentDataPrototypeRef;

    public RootArgumentDataPrototypeRefWrapper(RootArgumentDataPrototypeRef rootArgumentDataPrototypeRef) {
        this.rootArgumentDataPrototypeRef = rootArgumentDataPrototypeRef;
    }

   
    public ArgumentDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(rootArgumentDataPrototypeRef.getDest())) {
            
            return rootArgumentDataPrototypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRootArgumentDataPrototypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = rootArgumentDataPrototypeRef.getValue();
        java.lang.String type = rootArgumentDataPrototypeRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = rootArgumentDataPrototypeRef.getValue();
        java.lang.String type = rootArgumentDataPrototypeRef.getDest().toString().replace("_", "-");
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