package ca.vrg_online.app;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ModelAndView handleException(Exception ex, WebRequest request) throws Exception {

        if (AnnotationUtils.findAnnotation(ex.getClass(), ResponseStatus.class) != null) {
            throw ex;
        }

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex);
        mav.setViewName("global-exception");


        return mav;
    }

}
