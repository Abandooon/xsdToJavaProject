package stdgui.data.model.modelwrapper;


    
    


     

public class MeasurableSystemConstantValuesRefWrapper {

    
    
    private MeasurableSystemConstantValuesRef measurableSystemConstantValuesRef;

    public MeasurableSystemConstantValuesRefWrapper(MeasurableSystemConstantValuesRef measurableSystemConstantValuesRef) {
        this.measurableSystemConstantValuesRef = measurableSystemConstantValuesRef;
    }

   
    public SwSystemconstantValueSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(measurableSystemConstantValuesRef.getDest())) {
            
            return measurableSystemConstantValuesRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMeasurableSystemConstantValuesRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = measurableSystemConstantValuesRef.getValue();
        java.lang.String type = measurableSystemConstantValuesRef.getDest().toString().replace("_", "-");
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

    
    public SwSystemconstantValueSetWrapper getSwSystemconstantValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = measurableSystemConstantValuesRef.getValue();
        java.lang.String type = measurableSystemConstantValuesRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwSystemconstantValueSet){
            return new SwSystemconstantValueSetWrapper((SwSystemconstantValueSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}