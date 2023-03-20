/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.mobileid.icao.sdk;

import lombok.Builder;
import lombok.Getter;

/**
 *
 * @author Tan_Hung
 */
@Builder
@Getter
public class RequireFingerEnrollment {
    private String cardNo;
}
