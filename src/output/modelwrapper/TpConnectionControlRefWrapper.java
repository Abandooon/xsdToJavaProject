package stdgui.data.model.modelwrapper;


    
    


     

public class TpConnectionControlRefWrapper {

    
    
    private TpConnectionControlRef tpConnectionControlRef;

    public TpConnectionControlRefWrapper(TpConnectionControlRef tpConnectionControlRef) {
        this.tpConnectionControlRef = tpConnectionControlRef;
    }

   
    public FlexrayTpConnectionControlSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(tpConnectionControlRef.getDest())) {
            
            return tpConnectionControlRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTpConnectionControlRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = tpConnectionControlRef.getValue();
        java.lang.String type = tpConnectionControlRef.getDest().toString().replace("_", "-");
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

    
    public FlexrayTpConnectionControlWrapper getFlexrayTpConnectionControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = tpConnectionControlRef.getValue();
        java.lang.String type = tpConnectionControlRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpConnectionControl){
            return new FlexrayTpConnectionControlWrapper((FlexrayTpConnectionControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}