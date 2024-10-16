package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class StartsOnEventRefWrapper {

    
    
    private StartsOnEventRef startsOnEventRef;

    public StartsOnEventRefWrapper(StartsOnEventRef startsOnEventRef) {
        this.startsOnEventRef = startsOnEventRef;
    }

   
    public BswModuleEntitySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(startsOnEventRef.getDest())) {
            
            return startsOnEventRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getStartsOnEventRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = startsOnEventRef.getValue();
        java.lang.String type = startsOnEventRef.getDest().toString().replace("_", "-");
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

    
    public BswCalledEntityWrapper getBswCalledEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = startsOnEventRef.getValue();
        java.lang.String type = startsOnEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswCalledEntity){
            return new BswCalledEntityWrapper((BswCalledEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInterruptEntityWrapper getBswInterruptEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = startsOnEventRef.getValue();
        java.lang.String type = startsOnEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInterruptEntity){
            return new BswInterruptEntityWrapper((BswInterruptEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswSchedulableEntityWrapper getBswSchedulableEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = startsOnEventRef.getValue();
        java.lang.String type = startsOnEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswSchedulableEntity){
            return new BswSchedulableEntityWrapper((BswSchedulableEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}