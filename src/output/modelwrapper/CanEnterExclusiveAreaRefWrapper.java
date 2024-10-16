package stdgui.data.model.modelwrapper;


    
    


     

public class CanEnterExclusiveAreaRefWrapper {

    
    
    private CanEnterExclusiveAreaRef canEnterExclusiveAreaRef;

    public CanEnterExclusiveAreaRefWrapper(CanEnterExclusiveAreaRef canEnterExclusiveAreaRef) {
        this.canEnterExclusiveAreaRef = canEnterExclusiveAreaRef;
    }

   
    public ExclusiveAreaSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(canEnterExclusiveAreaRef.getDest())) {
            
            return canEnterExclusiveAreaRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCanEnterExclusiveAreaRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = canEnterExclusiveAreaRef.getValue();
        java.lang.String type = canEnterExclusiveAreaRef.getDest().toString().replace("_", "-");
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

    
    public ExclusiveAreaWrapper getExclusiveArea() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = canEnterExclusiveAreaRef.getValue();
        java.lang.String type = canEnterExclusiveAreaRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExclusiveArea){
            return new ExclusiveAreaWrapper((ExclusiveArea) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}