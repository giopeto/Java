package redissession.redissession;


import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("11", 11);

        filterChain.doFilter(request, response);
    }
}
