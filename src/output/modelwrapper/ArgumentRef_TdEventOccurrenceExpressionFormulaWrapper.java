package stdgui.data.model.modelwrapper;


    
    


     

public class ArgumentRef_TdEventOccurrenceExpressionFormulaWrapper {

    
    
    private ArgumentRef_TdEventOccurrenceExpressionFormula argumentRef_TdEventOccurrenceExpressionFormula;

    public ArgumentRef_TdEventOccurrenceExpressionFormulaWrapper(ArgumentRef_TdEventOccurrenceExpressionFormula argumentRef_TdEventOccurrenceExpressionFormula) {
        this.argumentRef_TdEventOccurrenceExpressionFormula = argumentRef_TdEventOccurrenceExpressionFormula;
    }

   
    public AutosarOperationArgumentInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(argumentRef_TdEventOccurrenceExpressionFormula.getDest())) {
            
            return argumentRef_TdEventOccurrenceExpressionFormula.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getArgumentRef_TdEventOccurrenceExpressionFormulaObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = argumentRef_TdEventOccurrenceExpressionFormula.getValue();
        java.lang.String type = argumentRef_TdEventOccurrenceExpressionFormula.getDest().toString().replace("_", "-");
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

    
    public AutosarOperationArgumentInstanceWrapper getAutosarOperationArgumentInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = argumentRef_TdEventOccurrenceExpressionFormula.getValue();
        java.lang.String type = argumentRef_TdEventOccurrenceExpressionFormula.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AutosarOperationArgumentInstance){
            return new AutosarOperationArgumentInstanceWrapper((AutosarOperationArgumentInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}