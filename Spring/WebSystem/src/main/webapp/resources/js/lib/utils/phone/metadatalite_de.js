/**
 * @license
 * Copyright (C) 2010 The Libphonenumber Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @fileoverview Generated metadata for file
 * ../resources/PhoneNumberMetadata.xml
 * @author Nikolaos Trogkanis
 */

goog.provide('i18n.phonenumbers.metadata');

/**
 * A mapping from a country calling code to the region codes which denote the
 * region represented by that country calling code. In the case of multiple
 * countries sharing a calling code, such as the NANPA regions, the one
 * indicated with "isMainCountryForCode" in the metadata should be first.
 * @type {Object.<number, Array.<string>>}
 */
i18n.phonenumbers.metadata.countryCodeToRegionCodeMap = {
    49:["DE"]
};

/**
 * A mapping from a region code to the PhoneMetadata for that region.
 * @type {Object.<string, Array>}
 */
i18n.phonenumbers.metadata.countryToMetadata = {
    "DE":[,[,,"[1-35-9]\\d{3,14}|4(?:[0-8]\\d{4,12}|9(?:[0-37]\\d|4(?:[1-35-8]|4\\d?)|5\\d{1,2}|6[1-8]\\d?)\\d{2,7})","\\d{2,15}"]
        ,[,,"[246]\\d{5,13}|3(?:0\\d{3,13}|2\\d{9}|[3-9]\\d{4,13})|5(?:0[2-8]|[1256]\\d|[38][0-8]|4\\d{0,2}|[79][0-7])\\d{3,11}|7(?:0[2-8]|[1-9]\\d)\\d{3,10}|8(?:0[2-9]|[1-9]\\d)\\d{3,10}|9(?:0[6-9]\\d{3,10}|1\\d{4,12}|[2-9]\\d{4,11})","\\d{2,15}"]
        ,[,,"1(?:5[0-2579]\\d{8}|6[023]\\d{7,8}|7(?:[0-57-9]\\d?|6\\d)\\d{7})","\\d{10,11}"]
        ,[,,"800\\d{7,12}","\\d{10,15}"]
        ,[,,"137[7-9]\\d{6}|900(?:[135]\\d{6}|9\\d{7})","\\d{10,11}"]
        ,[,,"1(?:3(?:7[1-6]\\d{6}|8\\d{4})|80\\d{5,11})","\\d{7,14}"]
        ,[,,"700\\d{8}","\\d{11}"]
        ,[,,"NA","NA"]
        ,"DE",49,"00","0",,,"0",,,,[[,"(1\\d{2})(\\d{7,8})","$1 $2",["1[67]"]
            ,"0$1","",0]
            ,[,"(1\\d{3})(\\d{7})","$1 $2",["15"]
                ,"0$1","",0]
            ,[,"(\\d{2})(\\d{3,11})","$1 $2",["3[02]|40|[68]9"]
                ,"0$1","",0]
            ,[,"(\\d{3})(\\d{3,11})","$1 $2",["2(?:\\d1|0[2389]|1[24]|28|34)|3(?:[3-9][15]|40)|[4-8][1-9]1|9(?:06|[1-9]1)"]
                ,"0$1","",0]
            ,[,"(\\d{4})(\\d{2,11})","$1 $2",["[24-6]|[7-9](?:\\d[1-9]|[1-9]\\d)|3(?:[3569][02-46-9]|4[2-4679]|7[2-467]|8[2-46-8])","[24-6]|[7-9](?:\\d[1-9]|[1-9]\\d)|3(?:3(?:0[1-467]|2[127-9]|3[124578]|[46][1246]|7[1257-9]|8[1256]|9[145])|4(?:2[135]|3[1357]|4[13578]|6[1246]|7[1356]|9[1346])|5(?:0[14]|2[1-3589]|3[1357]|4[1246]|6[1-4]|7[1346]|8[13568]|9[1246])|6(?:0[356]|2[1-489]|3[124-6]|4[1347]|6[13]|7[12579]|8[1-356]|9[135])|7(?:2[1-7]|3[1357]|4[145]|6[1-5]|7[1-4])|8(?:21|3[1468]|4[1347]|6[0135-9]|7[1467]|8[136])|9(?:0[12479]|2[1358]|3[1357]|4[134679]|6[1-9]|7[136]|8[147]|9[1468]))"]
                ,"0$1","",0]
            ,[,"(3\\d{4})(\\d{1,10})","$1 $2",["3"]
                ,"0$1","",0]
            ,[,"(800)(\\d{7,12})","$1 $2",["800"]
                ,"0$1","",0]
            ,[,"(177)(99)(\\d{7,8})","$1 $2 $3",["177","1779","17799"]
                ,"0$1","",0]
            ,[,"(\\d{3})(\\d)(\\d{4,10})","$1 $2 $3",["(?:18|90)0|137","1(?:37|80)|900[1359]"]
                ,"0$1","",0]
            ,[,"(1\\d{2})(\\d{5,11})","$1 $2",["181"]
                ,"0$1","",0]
            ,[,"(18\\d{3})(\\d{6})","$1 $2",["185","1850","18500"]
                ,"0$1","",0]
            ,[,"(18\\d{2})(\\d{7})","$1 $2",["18[68]"]
                ,"0$1","",0]
            ,[,"(18\\d)(\\d{8})","$1 $2",["18[2-579]"]
                ,"0$1","",0]
            ,[,"(700)(\\d{4})(\\d{4})","$1 $2 $3",["700"]
                ,"0$1","",0]
            ,[,"(138)(\\d{4})","$1 $2",["138"]
                ,"0$1","",0]
        ]
        ,,[,,"16(?:4\\d{1,10}|[89]\\d{1,11})","\\d{4,14}"]
        ,,,[,,"NA","NA"]
        ,[,,"18(?:1\\d{5,11}|[2-9]\\d{8})","\\d{8,14}"]
        ,,,[,,"17799\\d{7,8}","\\d{12,13}"]
    ]
};