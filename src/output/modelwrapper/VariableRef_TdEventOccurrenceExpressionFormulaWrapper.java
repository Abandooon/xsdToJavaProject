package stdgui.data.model.modelwrapper;


    
    


     

public class VariableRef_TdEventOccurrenceExpressionFormulaWrapper {

    
    
    private VariableRef_TdEventOccurrenceExpressionFormula variableRef_TdEventOccurrenceExpressionFormula;

    public VariableRef_TdEventOccurrenceExpressionFormulaWrapper(VariableRef_TdEventOccurrenceExpressionFormula variableRef_TdEventOccurrenceExpressionFormula) {
        this.variableRef_TdEventOccurrenceExpressionFormula = variableRef_TdEventOccurrenceExpressionFormula;
    }

   
    public AutosarVariableInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(variableRef_TdEventOccurrenceExpressionFormula.getDest())) {
            
            return variableRef_TdEventOccurrenceExpressionFormula.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getVariableRef_TdEventOccurrenceExpressionFormulaObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = variableRef_TdEventOccurrenceExpressionFormula.getValue();
        java.lang.String type = variableRef_TdEventOccurrenceExpressionFormula.getDest().toString().replace("_", "-");
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

    
    public AutosarVariableInstanceWrapper getAutosarVariableInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = variableRef_TdEventOccurrenceExpressionFormula.getValue();
        java.lang.String type = variableRef_TdEventOccurrenceExpressionFormula.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AutosarVariableInstance){
            return new AutosarVariableInstanceWrapper((AutosarVariableInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}