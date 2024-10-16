package stdgui.data.model.modelwrapper;


    
    


     

public class CalibrationParameterValueSetRefWrapper {

    
    
    private CalibrationParameterValueSetRef calibrationParameterValueSetRef;

    public CalibrationParameterValueSetRefWrapper(CalibrationParameterValueSetRef calibrationParameterValueSetRef) {
        this.calibrationParameterValueSetRef = calibrationParameterValueSetRef;
    }

   
    public CalibrationParameterValueSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(calibrationParameterValueSetRef.getDest())) {
            
            return calibrationParameterValueSetRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCalibrationParameterValueSetRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = calibrationParameterValueSetRef.getValue();
        java.lang.String type = calibrationParameterValueSetRef.getDest().toString().replace("_", "-");
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

    
    public CalibrationParameterValueSetWrapper getCalibrationParameterValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = calibrationParameterValueSetRef.getValue();
        java.lang.String type = calibrationParameterValueSetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CalibrationParameterValueSet){
            return new CalibrationParameterValueSetWrapper((CalibrationParameterValueSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}