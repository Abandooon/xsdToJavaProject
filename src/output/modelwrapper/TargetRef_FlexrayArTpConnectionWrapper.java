package stdgui.data.model.modelwrapper;


    
    


     

public class TargetRef_FlexrayArTpConnectionWrapper {

    
    
    private TargetRef_FlexrayArTpConnection targetRef_FlexrayArTpConnection;

    public TargetRef_FlexrayArTpConnectionWrapper(TargetRef_FlexrayArTpConnection targetRef_FlexrayArTpConnection) {
        this.targetRef_FlexrayArTpConnection = targetRef_FlexrayArTpConnection;
    }

   
    public FlexrayArTpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetRef_FlexrayArTpConnection.getDest())) {
            
            return targetRef_FlexrayArTpConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetRef_FlexrayArTpConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetRef_FlexrayArTpConnection.getValue();
        java.lang.String type = targetRef_FlexrayArTpConnection.getDest().toString().replace("_", "-");
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

    
    public FlexrayArTpNodeWrapper getFlexrayArTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRef_FlexrayArTpConnection.getValue();
        java.lang.String type = targetRef_FlexrayArTpConnection.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayArTpNode){
            return new FlexrayArTpNodeWrapper((FlexrayArTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}