package stdgui.data.model.modelwrapper;


    
    


     

public class BswInternalTriggeringPointRefWrapper {

    
    
    private BswInternalTriggeringPointRef bswInternalTriggeringPointRef;

    public BswInternalTriggeringPointRefWrapper(BswInternalTriggeringPointRef bswInternalTriggeringPointRef) {
        this.bswInternalTriggeringPointRef = bswInternalTriggeringPointRef;
    }

   
    public BswInternalTriggeringPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPointRef.getDest())) {
            
            return bswInternalTriggeringPointRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBswInternalTriggeringPointRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = bswInternalTriggeringPointRef.getValue();
        java.lang.String type = bswInternalTriggeringPointRef.getDest().toString().replace("_", "-");
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

    
    public BswInternalTriggeringPointWrapper getBswInternalTriggeringPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = bswInternalTriggeringPointRef.getValue();
        java.lang.String type = bswInternalTriggeringPointRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalTriggeringPoint){
            return new BswInternalTriggeringPointWrapper((BswInternalTriggeringPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}