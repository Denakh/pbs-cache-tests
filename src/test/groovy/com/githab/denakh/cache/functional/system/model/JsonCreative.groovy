package com.githab.denakh.cache.functional.system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class JsonCreative extends Creative {

    Value value

    JsonCreative(Value value) {
        super.type = Type.JSON
        this.value = value
    }

    static JsonCreative defaultJsonCreative() {
        new JsonCreative(Value.defaultValue())
    }

    static JsonCreative defaultExtendedJsonCreative() {
        new JsonCreative(Value.defaultExtendedValue())
    }

    @ToString(includeNames = true)
    static class Value {

        String adm
        Integer width
        Integer height
        Integer w
        Integer h
        HashMap ext
        String id
        String impid
        Double price

        static Value defaultValue() {
            new Value(adm: "<script type=\"text/javascript\">\n      rubicon_cb = Math.random(); rubicon_rurl = document.referrer; if(top.location==document.location){rubicon_rurl = document.location;} rubicon_rurl = escape(rubicon_rurl);\n      window.rubicon_ad = \"4073548\" + \".\" + \"js\";\n      window.rubicon_creative = \"4458534\" + \".\" + \"js\";\n    </script>\n<div style=\"width: 0; height: 0; overflow: hidden;\"><img border=\"0\" width=\"1\" height=\"1\" src=\"http://beacon-us-iad2.rubiconproject.com/beacon/d/f5b45196-4d05-4e42-8190-264d993c3515?accountId=1001&siteId=113932&zoneId=535510&e=6A1E40E384DA563BD667C48E6BE5FF2436D13A174DE937CDDAAF548B67FBAEBDC779E539A868F72E270E87E31888912083DA7E4E4D5AF24E782EF9778EE5B34E9F0ADFB8523971184242CC624DE62CD4BB342D372FA82497B63ADB685D502967FCB404AD24048D03AFEA50BAA8A987A017B93F2D2A1C5933B4A7786F3B6CF76724F5207A2458AD77E82A954C1004678A\" alt=\"\" /></div>\n\n\n<a href=\"http://optimized-by.rubiconproject.com/t/1001/113932/535510-15.4073548.4458534?url=http%3A%2F%2Frubiconproject.com\" target=\"_blank\"><img src=\"https://secure-assets.rubiconproject.com/campaigns/1001/50/59/48/1476242257campaign_file_q06ab2.png\" border=\"0\" alt=\"\" /></a><div style=\"height:0px;width:0px;overflow:hidden\"><script>(function(){document.write('<iframe src=\"https://tap2-cdn.rubiconproject.com/partner/scripts/rubicon/emily.html?pc=1001/113932&geo=na&co=us\" frameborder=\"0\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"NO\" width=\"0\" height=\"0\" style=\"height:0px;width:0px\"></iframe>');})();</script></div>\n",
                    width: 300,
                    height: 250)
        }

        static Value defaultExtendedValue() {
            new Value(adm: "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<VAST xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"3.0\" xsi:noNamespaceSchemaLocation=\"vast.xsd\">\n<Ad id=\"3951018\">\n<Wrapper>\n<AdSystem version=\"1\">RubiconProject</AdSystem>\n<VASTAdTagURI><![CDATA[https://sneezy.aws.rubiconproject.com/rp-eng-soln/rp-qa-sites/videoTest/ad2/alvin_VAST2.xml]]></VASTAdTagURI>\n<Error><![CDATA[http://beacon-nf.rubiconproject.com/beacon/ev/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=18F498A10003DB05AEE311D5E514295602303DF648D055B7729DC6766E8D51C90CB579EA431B28481196ECC4EA720554DB8C4B33C63E5B48709516FEAA96926E38C172756CD0C273CD0A44D8E27B9A18494BC59DB733915D051DC18DF3CEF043441CD73BB28DCC4D8C77BC3761399205B4A7786F3B6CF76724F5207A2458AD77CDA10306204D320B&ec=[ERRORCODE]]]></Error>\n<Impression><![CDATA[http://beacon-us-iad2.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=CBADCB97774921C6C4C7B3EB9B1780C79AB87D49481F9BD0A69B712E4A33EEBFE88F575C6E3A73D600EE72A81D2A85D5583952460373C1078D7DC42D37B71CE5A9043D0D8B4EDE5271FCEE60CB723065CD86ABEA5E8BE9FCE7F704D35C2F03FF99B648DA53FB584A8406EEA213F95AE618CE4540AE8602D002278611F6049DA4F82652B0011BD506]]></Impression>\n\n<Impression><![CDATA[http://cm.g.doubleclick.net/pixel?google_nid=rubicon&google_cm&google_sc]]></Impression>\n<Impression><![CDATA[http://rtd.tubemogul.com/upi/pid/btu4jd3a?redir=https%3A%2F%2Fpixel.rubiconproject.com%2Ftap.php%3Fv%3D191940%26nid%3D3778%26put%3D%24%7BUSER_ID%7D]]></Impression>\n<Impression><![CDATA[http://match.adsrvr.org/track/cmf/rubicon?]]></Impression>\n<Impression><![CDATA[http://sync.tidaltv.com/GenericUserSync.ashx?dpid=695]]></Impression>\n<Impression><![CDATA[http://sync.mathtag.com/sync/img?mt_exid=9]]></Impression>\n<Impression><![CDATA[http://i.w55c.net/ping_match.gif?ei=RUBICON&rurl=https%3A%2F%2Fpixel.rubiconproject.com%2Ftap.php%3Fv%3D4210%26nid%3D1523%26put%3D_wfivefivec_%26expires%3D30]]></Impression>\n<Impression><![CDATA[http://track.eyeviewads.com/sync/rbcn?]]></Impression>\n<Impression><![CDATA[http://ib.adnxs.com/getuidnb?http%3A%2F%2Fpixel.rubiconproject.com%2Ftap.php%3Fv%3D109108%26nid%3D3876%26put%3D\$UID%26expires%3D30]]></Impression>\n<Impression><![CDATA[http://token.rubiconproject.com/register?khaos=JJG3G275-F-JZW8]]></Impression>\n\n<Creatives>\n<Creative>\n<Linear>\n<TrackingEvents>\n<Tracking event=\"creativeView\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=498E45A22EEBCA4669BBF4440775EBDAAEE311D5E514295602303DF648D055B7729DC6766E8D51C90CB579EA431B28481196ECC4EA720554DB8C4B33C63E5B48709516FEAA96926E38C172756CD0C273CD0A44D8E27B9A18494BC59DB733915D051DC18DF3CEF043441CD73BB28DCC4D8C77BC3761399205B4A7786F3B6CF76724F5207A2458AD77CDA10306204D320B]]></Tracking>\n<Tracking event=\"start\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=085EEF5E8475C8BFAEE311D5E514295602303DF648D055B7729DC6766E8D51C90CB579EA431B28481196ECC4EA720554DB8C4B33C63E5B48709516FEAA96926E38C172756CD0C273CD0A44D8E27B9A18494BC59DB733915D051DC18DF3CEF043441CD73BB28DCC4D8C77BC3761399205B4A7786F3B6CF76724F5207A2458AD77CDA10306204D320B]]></Tracking>\n<Tracking event=\"midpoint\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=2D6EF7C7B3D881A9BBC0D8837E3A8A051F35EC3A18832B24B6E7E88D285238A8F3114A37E8A6AD51A5BA5ECD886C32F283DA7E4E4D5AF24EFBC586F0043BE4B21B396E48FFF52FE4A168F2E97C1E7B1C172CD28438FCBB6A6758E90B96020E38DFC23D253F330FA20C80AE327C8339A767461487198649E7FDC7548137E43A7460411C8963DB427A]]></Tracking>\n<Tracking event=\"firstQuartile\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=C1A0864160A107F4E92FFF5F4F56275202735A40729E771C14497B14678E9B626AD673CDDA3F42430092BC34C15F5110039C46479ECCA7525CE751AD17DD54082EF630044BD97086971F841BAC6CD1B4FD099CEA8811393233220358BDED903ABC24274129CF596C9B700C6124957EFF1F2217C118C9B69E1657434059D60378FC3BE8685EBA97EB6AA81EE0ABBF880B]]></Tracking>\n<Tracking event=\"thirdQuartile\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=3ADD8F99CD221680E92FFF5F4F56275202735A40729E771C14497B14678E9B626AD673CDDA3F42430092BC34C15F5110039C46479ECCA7525CE751AD17DD54082EF630044BD97086971F841BAC6CD1B4FD099CEA8811393233220358BDED903ABC24274129CF596C9B700C6124957EFF1F2217C118C9B69E1657434059D60378FC3BE8685EBA97EB6AA81EE0ABBF880B]]></Tracking>\n<Tracking event=\"complete\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=EF05D8E5B84FFBB0BBC0D8837E3A8A051F35EC3A18832B24B6E7E88D285238A8F3114A37E8A6AD51A5BA5ECD886C32F283DA7E4E4D5AF24EFBC586F0043BE4B21B396E48FFF52FE4A168F2E97C1E7B1C172CD28438FCBB6A6758E90B96020E38DFC23D253F330FA20C80AE327C8339A767461487198649E7FDC7548137E43A7460411C8963DB427A]]></Tracking>\n<Tracking event=\"mute\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=2B92B961502A6BC253E2BD43A1715C61A7AFC2280C10152E24AFD49CE68B519454B1725AC1BDC2BC5B612910A5E428BE0F0AA8AAE1F7EB238BB8E1CEE8E3FB8597878304326188EDE3A3B47F53F937712BB14CB3BF112B3DA961142D3513D6419FFB3004132A42D60092128A607AC9510725310C773DF8149F3AAF0C74326D84E82A954C1004678A]]></Tracking>\n<Tracking event=\"unmute\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=7099664B02492A9A02735A40729E771C14497B14678E9B626AD673CDDA3F42430092BC34C15F5110039C46479ECCA7525CE751AD17DD54082EF630044BD97086971F841BAC6CD1B4FD099CEA8811393233220358BDED903ABC24274129CF596C9B700C6124957EFF1F2217C118C9B69E1657434059D60378FC3BE8685EBA97EB6AA81EE0ABBF880B]]></Tracking>\n<Tracking event=\"pause\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=537D565B962D5E5EAEE311D5E514295602303DF648D055B7729DC6766E8D51C90CB579EA431B28481196ECC4EA720554DB8C4B33C63E5B48709516FEAA96926E38C172756CD0C273CD0A44D8E27B9A18494BC59DB733915D051DC18DF3CEF043441CD73BB28DCC4D8C77BC3761399205B4A7786F3B6CF76724F5207A2458AD77CDA10306204D320B]]></Tracking>\n<Tracking event=\"rewind\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=BD609E00B192AF7002735A40729E771C14497B14678E9B626AD673CDDA3F42430092BC34C15F5110039C46479ECCA7525CE751AD17DD54082EF630044BD97086971F841BAC6CD1B4FD099CEA8811393233220358BDED903ABC24274129CF596C9B700C6124957EFF1F2217C118C9B69E1657434059D60378FC3BE8685EBA97EB6AA81EE0ABBF880B]]></Tracking>\n<Tracking event=\"resume\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=6D10E5D7C30935A402735A40729E771C14497B14678E9B626AD673CDDA3F42430092BC34C15F5110039C46479ECCA7525CE751AD17DD54082EF630044BD97086971F841BAC6CD1B4FD099CEA8811393233220358BDED903ABC24274129CF596C9B700C6124957EFF1F2217C118C9B69E1657434059D60378FC3BE8685EBA97EB6AA81EE0ABBF880B]]></Tracking>\n<Tracking event=\"fullscreen\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=FB78FA73384AC4F61532B119464B0E389AB87D49481F9BD0A69B712E4A33EEBFE88F575C6E3A73D600EE72A81D2A85D5583952460373C1078D7DC42D37B71CE5A9043D0D8B4EDE5271FCEE60CB723065CD86ABEA5E8BE9FCE7F704D35C2F03FF99B648DA53FB584A8406EEA213F95AE618CE4540AE8602D002278611F6049DA4F82652B0011BD506]]></Tracking>\n<Tracking event=\"expand\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=D9F0942D2A84BFD802735A40729E771C14497B14678E9B626AD673CDDA3F42430092BC34C15F5110039C46479ECCA7525CE751AD17DD54082EF630044BD97086971F841BAC6CD1B4FD099CEA8811393233220358BDED903ABC24274129CF596C9B700C6124957EFF1F2217C118C9B69E1657434059D60378FC3BE8685EBA97EB6AA81EE0ABBF880B]]></Tracking>\n<Tracking event=\"collapse\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=C140A0DE32AE5E44BBC0D8837E3A8A051F35EC3A18832B24B6E7E88D285238A8F3114A37E8A6AD51A5BA5ECD886C32F283DA7E4E4D5AF24EFBC586F0043BE4B21B396E48FFF52FE4A168F2E97C1E7B1C172CD28438FCBB6A6758E90B96020E38DFC23D253F330FA20C80AE327C8339A767461487198649E7FDC7548137E43A7460411C8963DB427A]]></Tracking>\n<Tracking event=\"acceptInvitationLinear\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=CB7F724D5631BC92B5E2858846470B464E98468727030F9196D6B8BB449AAE6E1CAC584139D91EA22CA5F352E3CECFA1B9806957121D9F105BD03C34DBB6DE8113F7CA38B5D583DEEFE270D589C11C2EE4264AA02147A073048FDCA4C7453D08A4C5C8DAD5FE4F41209B7E9301A965DD514E3A56156368657F3CE07832D615C304849D224A7549B24A1E9886F9AC9B78]]></Tracking>\n<Tracking event=\"closeLinear\"><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=092D8A55AE9E0694AEE311D5E514295602303DF648D055B7729DC6766E8D51C90CB579EA431B28481196ECC4EA720554DB8C4B33C63E5B48709516FEAA96926E38C172756CD0C273CD0A44D8E27B9A18494BC59DB733915D051DC18DF3CEF043441CD73BB28DCC4D8C77BC3761399205B4A7786F3B6CF76724F5207A2458AD77CDA10306204D320B]]></Tracking>\n</TrackingEvents>\n<VideoClicks>\n<ClickTracking><![CDATA[http://beacon-nf.rubiconproject.com/beacon/v/16245d19-47bd-42b4-8936-939a1a087f45?oo=0&accountId=7780&siteId=87184&zoneId=412394&sizeId=201&e=6C7EF07A52FED295AEE311D5E514295602303DF648D055B7729DC6766E8D51C90CB579EA431B28481196ECC4EA720554DB8C4B33C63E5B48709516FEAA96926E38C172756CD0C273CD0A44D8E27B9A18494BC59DB733915D051DC18DF3CEF043441CD73BB28DCC4D8C77BC3761399205B4A7786F3B6CF76724F5207A2458AD77CDA10306204D320B]]></ClickTracking>\n</VideoClicks>\n</Linear>\n</Creative>\n</Creatives>\n<Extensions>\n<Extension name=\"com.rubiconproject.data\" type=\"Value\">\n\n<AdServingData>\n<ImpressionId><![CDATA[16245d19-47bd-42b4-8936-939a1a087f45]]></ImpressionId>\n<ClearingPrice currency=\"USD\">0.000000</ClearingPrice>\n\n\n\n</AdServingData>\n</Extension>\n\n</Extensions>\n</Wrapper>\n</Ad>\n</VAST>\n",
                    ext: [
                            "bidder": [
                                    "rp": [
                                            "mime"     : "text/html",
                                            "size_id"  : 201,
                                            "targeting": [
                                                    [
                                                            "key"   : "rpfl_1001",
                                                            "values": [
                                                                    "15_tier0100"
                                                            ]
                                                    ]
                                            ]
                                    ]
                            ],
                            "prebid": [
                                    "targeting": [
                                            "hb_bidder"           : "rubicon",
                                            "hb_bidder_rubicon"   : "rubicon",
                                            "hb_creative_loadtype": "html",
                                            "hb_pb"               : "1.00",
                                            "hb_pb_rubicon"       : "1.00",
                                            "hb_size"             : "300x250",
                                            "hb_size_rubicon"     : "300x250",
                                            "hb_uuid"             : "b760c9c5-2c6b-4ae9-a184-b31e9d76e2db"
                                    ],
                                    "type"     : "video"
                            ]
                    ],
                    h: 480,
                    id: "0",
                    impid: "example_video1",
                    price: 10.50,
                    w: 640)
        }
    }
}
