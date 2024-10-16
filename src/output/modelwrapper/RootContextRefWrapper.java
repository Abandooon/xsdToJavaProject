package stdgui.data.model.modelwrapper;


    
    


     

public class RootContextRefWrapper {

    
    
    private RootContextRef rootContextRef;

    public RootContextRefWrapper(RootContextRef rootContextRef) {
        this.rootContextRef = rootContextRef;
    }

   
    public RootSwCompositionPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(rootContextRef.getDest())) {
            
            return rootContextRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRootContextRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = rootContextRef.getValue();
        java.lang.String type = rootContextRef.getDest().toString().replace("_", "-");
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

    
    public RootSwCompositionPrototypeWrapper getRootSwCompositionPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = rootContextRef.getValue();
        java.lang.String type = rootContextRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RootSwCompositionPrototype){
            return new RootSwCompositionPrototypeWrapper((RootSwCompositionPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}