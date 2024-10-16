package stdgui.data.model.modelwrapper;


    
    


     

public class ExclusiveAreaNestingOrderRefWrapper {

    
    
    private ExclusiveAreaNestingOrderRef exclusiveAreaNestingOrderRef;

    public ExclusiveAreaNestingOrderRefWrapper(ExclusiveAreaNestingOrderRef exclusiveAreaNestingOrderRef) {
        this.exclusiveAreaNestingOrderRef = exclusiveAreaNestingOrderRef;
    }

   
    public ExclusiveAreaNestingOrderSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(exclusiveAreaNestingOrderRef.getDest())) {
            
            return exclusiveAreaNestingOrderRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getExclusiveAreaNestingOrderRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = exclusiveAreaNestingOrderRef.getValue();
        java.lang.String type = exclusiveAreaNestingOrderRef.getDest().toString().replace("_", "-");
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

    
    public ExclusiveAreaNestingOrderWrapper getExclusiveAreaNestingOrder() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = exclusiveAreaNestingOrderRef.getValue();
        java.lang.String type = exclusiveAreaNestingOrderRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExclusiveAreaNestingOrder){
            return new ExclusiveAreaNestingOrderWrapper((ExclusiveAreaNestingOrder) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}