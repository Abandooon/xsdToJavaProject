package stdgui.data.model.modelwrapper;


    
    


     

public class DiagnosticFreezeFrameRefWrapper {

    
    
    private DiagnosticFreezeFrameRef diagnosticFreezeFrameRef;

    public DiagnosticFreezeFrameRefWrapper(DiagnosticFreezeFrameRef diagnosticFreezeFrameRef) {
        this.diagnosticFreezeFrameRef = diagnosticFreezeFrameRef;
    }

   
    public DiagnosticFreezeFrameSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrameRef.getDest())) {
            
            return diagnosticFreezeFrameRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticFreezeFrameRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticFreezeFrameRef.getValue();
        java.lang.String type = diagnosticFreezeFrameRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticFreezeFrameWrapper getDiagnosticFreezeFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticFreezeFrameRef.getValue();
        java.lang.String type = diagnosticFreezeFrameRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticFreezeFrame){
            return new DiagnosticFreezeFrameWrapper((DiagnosticFreezeFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}