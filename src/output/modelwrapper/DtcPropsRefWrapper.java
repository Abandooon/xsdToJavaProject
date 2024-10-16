package stdgui.data.model.modelwrapper;


    
    


     

public class DtcPropsRefWrapper {

    
    
    private DtcPropsRef dtcPropsRef;

    public DtcPropsRefWrapper(DtcPropsRef dtcPropsRef) {
        this.dtcPropsRef = dtcPropsRef;
    }

   
    public DiagnosticTroubleCodePropsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dtcPropsRef.getDest())) {
            
            return dtcPropsRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDtcPropsRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dtcPropsRef.getValue();
        java.lang.String type = dtcPropsRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticTroubleCodePropsWrapper getDiagnosticTroubleCodeProps() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dtcPropsRef.getValue();
        java.lang.String type = dtcPropsRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeProps){
            return new DiagnosticTroubleCodePropsWrapper((DiagnosticTroubleCodeProps) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}