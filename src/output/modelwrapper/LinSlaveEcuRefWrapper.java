package stdgui.data.model.modelwrapper;


    
    


     

public class LinSlaveEcuRefWrapper {

    
    
    private LinSlaveEcuRef linSlaveEcuRef;

    public LinSlaveEcuRefWrapper(LinSlaveEcuRef linSlaveEcuRef) {
        this.linSlaveEcuRef = linSlaveEcuRef;
    }

   
    public LinSlaveSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(linSlaveEcuRef.getDest())) {
            
            return linSlaveEcuRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getLinSlaveEcuRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = linSlaveEcuRef.getValue();
        java.lang.String type = linSlaveEcuRef.getDest().toString().replace("_", "-");
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

    
    public LinSlaveWrapper getLinSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = linSlaveEcuRef.getValue();
        java.lang.String type = linSlaveEcuRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSlave){
            return new LinSlaveWrapper((LinSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}