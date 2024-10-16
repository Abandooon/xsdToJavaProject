package stdgui.data.model.modelwrapper;


    
    


     

public class IndicatorRefWrapper {

    
    
    private IndicatorRef indicatorRef;

    public IndicatorRefWrapper(IndicatorRef indicatorRef) {
        this.indicatorRef = indicatorRef;
    }

   
    public DiagnosticIndicatorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(indicatorRef.getDest())) {
            
            return indicatorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getIndicatorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = indicatorRef.getValue();
        java.lang.String type = indicatorRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticIndicatorWrapper getDiagnosticIndicator() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = indicatorRef.getValue();
        java.lang.String type = indicatorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIndicator){
            return new DiagnosticIndicatorWrapper((DiagnosticIndicator) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}