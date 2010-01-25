/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.seam.j2se.jit_faces.config;

/**
 *
 * @author hernanv
 */
public enum ServletInitParams{

    //jsf - InitParams
    javax_faces_STATE_SAVING_METHOD("javax.faces.STATE_SAVING_METHOD","server"),
    javax_faces_DEFAULT_SUFFIX("javax.faces.DEFAULT_SUFFIX",".xhtml"),
    javax_faces_CONFIG_FILES("javax.faces.CONFIG_FILES","META-INF/faces-config.xml"),
    javax_faces_LIFECYCLE_ID("javax.faces.LIFECYCLE_ID",null),

    //jsf sun-ri - boolean params
    com_sun_faces_displayConfiguration("com.sun.faces.displayConfiguration",null),
    com_sun_faces_validateXml("com.sun.faces.validateXml",null),
    com_sun_faces_verifyObjects("com.sun.faces.verifyObjects",null),
    com_sun_faces_forceLoadConfiguration("com.sun.faces.forceLoadConfiguration",null),
    com_sun_faces_disableVersionTracking("com.sun.faces.disableVersionTracking",null),
    com_sun_faces_enableHtmlTagLibValidator("com.sun.faces.enableHtmlTagLibValidator",null),
    com_sun_faces_preferXHTML("com.sun.faces.preferXHTML",null),
    com_sun_faces_PreferXHTML("com.sun.faces.PreferXHTML",null),
    com_sun_faces_compressViewState("com.sun.faces.compressViewState",null),
    com_sun_faces_COMPRESS_STATE("com.sun.faces.COMPRESS_STATE",null),
    com_sun_faces_compressJavaScript("com.sun.faces.compressJavaScript",null),
    com_sun_faces_externalizeJavaScript("com.sun.faces.externalizeJavaScript",null),
    com_sun_faces_sendPoweredByHeader("com.sun.faces.sendPoweredByHeader", "false" ),
    com_sun_faces_enableJSStyleHiding("com.sun.faces.enableJSStyleHiding",null),
    com_sun_faces_enableScriptsInAttributeValues("com.sun.faces.enableScriptsInAttributeValues",null),
    com_sun_faces_writeStateAtFormEnd("com.sun.faces.writeStateAtFormEnd",null),
    com_sun_faces_enableLazyBeanValidation("com.sun.faces.enableLazyBeanValidation",null),
    com_sun_faces_enabledLoadBundle11Compatibility("com.sun.faces.enabledLoadBundle11Compatibility",null),
    com_sun_faces_enableRestoreView11Compatibility("com.sun.faces.enableRestoreView11Compatibility",null),
    com_sun_faces_serializeServerState("com.sun.faces.serializeServerState",null),
    com_sun_faces_enableViewStateIdRendering("com.sun.faces.enableViewStateIdRendering",null),
    com_sun_faces_registerConverterPropertyEditors("com.sun.faces.registerConverterPropertyEditors",null),
    com_sun_faces_developmentMode("com.sun.faces.developmentMode",null),

    //jsf sun-ri - InitParams
    com_sun_faces_managedBeanFactoryDecoratorClass("com.sun.faces.managedBeanFactoryDecoratorClass",null),
    com_sun_faces_numberOfViewsInSession("com.sun.faces.numberOfViewsInSession",null),
    com_sun_faces_NUMBER_OF_VIEWS_IN_SESSION("com.sun.faces.NUMBER_OF_VIEWS_IN_SESSION",null),
    com_sun_faces_numberOfLogicalViews("com.sun.faces.numberOfLogicalViews",null),
    com_sun_faces_NUMBER_OF_VIEWS_IN_LOGICAL_VIEW_IN_SESSION("com.sun.faces.NUMBER_OF_VIEWS_IN_LOGICAL_VIEW_IN_SESSION",null),
    com_sun_faces_injectionProvider("com.sun.faces.injectionProvider",null),
    com_sun_faces_serializationProvider("com.sun.faces.serializationProvider",null),
    com_sun_faces_responseBufferSize("com.sun.faces.responseBufferSize",null),
    com_sun_faces_clientStateWriteBufferSize("com.sun.faces.clientStateWriteBufferSize",null),
    com_sun_faces_expressionFactory("com.sun.faces.expressionFactory", "org.jboss.el.ExpressionFactoryImpl"),
    com_sun_faces_clientStateTimeout("com.sun.faces.clientStateTimeout",null),
    com_sun_faces_disableUnicodeEscaping("com.sun.faces.disableUnicodeEscaping",null),
    com_sun_faces_duplicateJARPattern("com.sun.faces.duplicateJARPattern",null),

    //Facelets configuration
    facelets_VIEW_MAPPINGS("facelets.VIEW_MAPPINGS",null),
    facelets_LIBRARIES("facelets.LIBRARIES",null),
    facelets_DECORATORS("facelets.DECORATORS",null),
    facelets_DEVELOPMENT("facelets.DEVELOPMENT","true"),
    facelets_RESOURCE_RESOLVER("facelets.RESOURCE_RESOLVER",null),
    facelets_BUILD_BEFORE_RESTORE("facelets.BUILD_BEFORE_RESTORE",null),
    facelets_BUFFER_SIZE("facelets.BUFFER_SIZE",null),
    facelets_REFRESH_PERIOD("facelets.REFRESH_PERIOD",null),
    facelets_SKIP_COMMENTS("facelets.SKIP_COMMENTS",null);


    private String id = null;
    private String value = null;

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    private ServletInitParams(String id, String value) {
        this.id = id;
        this.value = value;
        
    }
}
