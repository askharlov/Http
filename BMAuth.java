package ua.com.samples.ash.http;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Auth {

    @SerializedName("$id")
    @Expose
    private String $id;
    @SerializedName("$level")
    @Expose
    private String $level;
    @SerializedName("$")
    @Expose
    private String $;

    public String get$id() {
        return $id;
    }

    public void set$id(String $id) {
        this.$id = $id;
    }

    public String get$level() {
        return $level;
    }

    public void set$level(String $level) {
        this.$level = $level;
    }

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}

public class BMAuth {

    @SerializedName("doc")
    @Expose
    private Doc doc;

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

}
class Doc {

    @SerializedName("$lang")
    @Expose
    private String $lang;
    @SerializedName("$func")
    @Expose
    private String $func;
    @SerializedName("$binary")
    @Expose
    private String $binary;
    @SerializedName("$host")
    @Expose
    private String $host;
    @SerializedName("$themename")
    @Expose
    private String $themename;
    @SerializedName("$theme")
    @Expose
    private String $theme;
    @SerializedName("$stylesheet")
    @Expose
    private String $stylesheet;
    @SerializedName("$features")
    @Expose
    private String $features;
    @SerializedName("$notify")
    @Expose
    private String $notify;
    @SerializedName("$css")
    @Expose
    private String $css;
    @SerializedName("$logo")
    @Expose
    private String $logo;
    @SerializedName("$logolink")
    @Expose
    private String $logolink;
    @SerializedName("$favicon")
    @Expose
    private String $favicon;
    @SerializedName("$localdir")
    @Expose
    private String $localdir;
    @SerializedName("auth")
    @Expose
    private Auth auth;
    @SerializedName("messages")
    @Expose
    private Messages messages;
    @SerializedName("saved_filters")
    @Expose
    private SavedFilters savedFilters;
    @SerializedName("tips")
    @Expose
    private Tips tips;
    @SerializedName("tparams")
    @Expose
    private Tparams tparams;

    public String get$lang() {
        return $lang;
    }

    public void set$lang(String $lang) {
        this.$lang = $lang;
    }

    public String get$func() {
        return $func;
    }

    public void set$func(String $func) {
        this.$func = $func;
    }

    public String get$binary() {
        return $binary;
    }

    public void set$binary(String $binary) {
        this.$binary = $binary;
    }

    public String get$host() {
        return $host;
    }

    public void set$host(String $host) {
        this.$host = $host;
    }

    public String get$themename() {
        return $themename;
    }

    public void set$themename(String $themename) {
        this.$themename = $themename;
    }

    public String get$theme() {
        return $theme;
    }

    public void set$theme(String $theme) {
        this.$theme = $theme;
    }

    public String get$stylesheet() {
        return $stylesheet;
    }

    public void set$stylesheet(String $stylesheet) {
        this.$stylesheet = $stylesheet;
    }

    public String get$features() {
        return $features;
    }

    public void set$features(String $features) {
        this.$features = $features;
    }

    public String get$notify() {
        return $notify;
    }

    public void set$notify(String $notify) {
        this.$notify = $notify;
    }

    public String get$css() {
        return $css;
    }

    public void set$css(String $css) {
        this.$css = $css;
    }

    public String get$logo() {
        return $logo;
    }

    public void set$logo(String $logo) {
        this.$logo = $logo;
    }

    public String get$logolink() {
        return $logolink;
    }

    public void set$logolink(String $logolink) {
        this.$logolink = $logolink;
    }

    public String get$favicon() {
        return $favicon;
    }

    public void set$favicon(String $favicon) {
        this.$favicon = $favicon;
    }

    public String get$localdir() {
        return $localdir;
    }

    public void set$localdir(String $localdir) {
        this.$localdir = $localdir;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public SavedFilters getSavedFilters() {
        return savedFilters;
    }

    public void setSavedFilters(SavedFilters savedFilters) {
        this.savedFilters = savedFilters;
    }

    public Tips getTips() {
        return tips;
    }

    public void setTips(Tips tips) {
        this.tips = tips;
    }

    public Tparams getTparams() {
        return tparams;
    }

    public void setTparams(Tparams tparams) {
        this.tparams = tparams;
    }

}
class Func {

    @SerializedName("$")
    @Expose
    private String $;

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}
class Messages {

    @SerializedName("$name")
    @Expose
    private String $name;
    @SerializedName("$checked")
    @Expose
    private String $checked;
    @SerializedName("msg")
    @Expose
    private Msg msg;

    public String get$name() {
        return $name;
    }

    public void set$name(String $name) {
        this.$name = $name;
    }

    public String get$checked() {
        return $checked;
    }

    public void set$checked(String $checked) {
        this.$checked = $checked;
    }

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

}
class Msg {

    @SerializedName("ar")
    @Expose
    private String ar;
    @SerializedName("bg")
    @Expose
    private String bg;
    @SerializedName("cn")
    @Expose
    private String cn;
    @SerializedName("cz")
    @Expose
    private String cz;
    @SerializedName("de")
    @Expose
    private String de;
    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("es")
    @Expose
    private String es;
    @SerializedName("et")
    @Expose
    private String et;
    @SerializedName("fi")
    @Expose
    private String fi;
    @SerializedName("fr")
    @Expose
    private String fr;
    @SerializedName("hu")
    @Expose
    private String hu;
    @SerializedName("hy")
    @Expose
    private String hy;
    @SerializedName("it")
    @Expose
    private String it;
    @SerializedName("jp")
    @Expose
    private String jp;
    @SerializedName("ku")
    @Expose
    private String ku;
    @SerializedName("kz")
    @Expose
    private String kz;
    @SerializedName("lt")
    @Expose
    private String lt;
    @SerializedName("nl")
    @Expose
    private String nl;
    @SerializedName("pl")
    @Expose
    private String pl;
    @SerializedName("pt")
    @Expose
    private String pt;
    @SerializedName("ro")
    @Expose
    private String ro;
    @SerializedName("ru")
    @Expose
    private String ru;
    @SerializedName("th")
    @Expose
    private String th;
    @SerializedName("ua")
    @Expose
    private String ua;
    @SerializedName("xx")
    @Expose
    private String xx;
    @SerializedName("zh")
    @Expose
    private String zh;
    @SerializedName("ko")
    @Expose
    private String ko;
    @SerializedName("ntfb_recovery")
    @Expose
    private String ntfbRecovery;
    @SerializedName("restorepassword")
    @Expose
    private String restorepassword;
    @SerializedName("ntfb_register")
    @Expose
    private String ntfbRegister;
    @SerializedName("ntfb_password")
    @Expose
    private String ntfbPassword;
    @SerializedName("ntfb_login")
    @Expose
    private String ntfbLogin;
    @SerializedName("ntfb_login-ok")
    @Expose
    private String ntfbLoginOk;
    @SerializedName("ntfb_not_my_pc")
    @Expose
    private String ntfbNotMyPc;
    @SerializedName("ntfb_login_with")
    @Expose
    private String ntfbLoginWith;
    @SerializedName("showroom")
    @Expose
    private String showroom;
    @SerializedName("full_version")
    @Expose
    private String fullVersion;
    @SerializedName("mobile_version")
    @Expose
    private String mobileVersion;
    @SerializedName("mobile_provider")
    @Expose
    private String mobileProvider;
    @SerializedName("mobile_savepassword")
    @Expose
    private String mobileSavepassword;
    @SerializedName("mobile_domain")
    @Expose
    private String mobileDomain;
    @SerializedName("error_access_29")
    @Expose
    private String errorAccess29;
    @SerializedName("theme")
    @Expose
    private String theme;
    @SerializedName("enter")
    @Expose
    private String enter;
    @SerializedName("badagent")
    @Expose
    private String badagent;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("contacts")
    @Expose
    private String contacts;
    @SerializedName("cookie")
    @Expose
    private String cookie;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("expirepass")
    @Expose
    private String expirepass;
    @SerializedName("expirepassbadconfirm")
    @Expose
    private String expirepassbadconfirm;
    @SerializedName("expirepassbadnew")
    @Expose
    private String expirepassbadnew;
    @SerializedName("fail")
    @Expose
    private String fail;
    @SerializedName("iown")
    @Expose
    private String iown;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("loading")
    @Expose
    private String loading;
    @SerializedName("newconfirm")
    @Expose
    private String newconfirm;
    @SerializedName("newpasswd")
    @Expose
    private String newpasswd;
    @SerializedName("noproject")
    @Expose
    private String noproject;
    @SerializedName("oldpasswd")
    @Expose
    private String oldpasswd;
    @SerializedName("passwd")
    @Expose
    private String passwd;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("recovery")
    @Expose
    private String recovery;
    @SerializedName("registration")
    @Expose
    private String registration;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("user")
    @Expose
    private String user;

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getEt() {
        return et;
    }

    public void setEt(String et) {
        this.et = et;
    }

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getHu() {
        return hu;
    }

    public void setHu(String hu) {
        this.hu = hu;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getJp() {
        return jp;
    }

    public void setJp(String jp) {
        this.jp = jp;
    }

    public String getKu() {
        return ku;
    }

    public void setKu(String ku) {
        this.ku = ku;
    }

    public String getKz() {
        return kz;
    }

    public void setKz(String kz) {
        this.kz = kz;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getRo() {
        return ro;
    }

    public void setRo(String ro) {
        this.ro = ro;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public String getKo() {
        return ko;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }

    public String getNtfbRecovery() {
        return ntfbRecovery;
    }

    public void setNtfbRecovery(String ntfbRecovery) {
        this.ntfbRecovery = ntfbRecovery;
    }

    public String getRestorepassword() {
        return restorepassword;
    }

    public void setRestorepassword(String restorepassword) {
        this.restorepassword = restorepassword;
    }

    public String getNtfbRegister() {
        return ntfbRegister;
    }

    public void setNtfbRegister(String ntfbRegister) {
        this.ntfbRegister = ntfbRegister;
    }

    public String getNtfbPassword() {
        return ntfbPassword;
    }

    public void setNtfbPassword(String ntfbPassword) {
        this.ntfbPassword = ntfbPassword;
    }

    public String getNtfbLogin() {
        return ntfbLogin;
    }

    public void setNtfbLogin(String ntfbLogin) {
        this.ntfbLogin = ntfbLogin;
    }

    public String getNtfbLoginOk() {
        return ntfbLoginOk;
    }

    public void setNtfbLoginOk(String ntfbLoginOk) {
        this.ntfbLoginOk = ntfbLoginOk;
    }

    public String getNtfbNotMyPc() {
        return ntfbNotMyPc;
    }

    public void setNtfbNotMyPc(String ntfbNotMyPc) {
        this.ntfbNotMyPc = ntfbNotMyPc;
    }

    public String getNtfbLoginWith() {
        return ntfbLoginWith;
    }

    public void setNtfbLoginWith(String ntfbLoginWith) {
        this.ntfbLoginWith = ntfbLoginWith;
    }

    public String getShowroom() {
        return showroom;
    }

    public void setShowroom(String showroom) {
        this.showroom = showroom;
    }

    public String getFullVersion() {
        return fullVersion;
    }

    public void setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
    }

    public String getMobileVersion() {
        return mobileVersion;
    }

    public void setMobileVersion(String mobileVersion) {
        this.mobileVersion = mobileVersion;
    }

    public String getMobileProvider() {
        return mobileProvider;
    }

    public void setMobileProvider(String mobileProvider) {
        this.mobileProvider = mobileProvider;
    }

    public String getMobileSavepassword() {
        return mobileSavepassword;
    }

    public void setMobileSavepassword(String mobileSavepassword) {
        this.mobileSavepassword = mobileSavepassword;
    }

    public String getMobileDomain() {
        return mobileDomain;
    }

    public void setMobileDomain(String mobileDomain) {
        this.mobileDomain = mobileDomain;
    }

    public String getErrorAccess29() {
        return errorAccess29;
    }

    public void setErrorAccess29(String errorAccess29) {
        this.errorAccess29 = errorAccess29;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

    public String getBadagent() {
        return badagent;
    }

    public void setBadagent(String badagent) {
        this.badagent = badagent;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getExpirepass() {
        return expirepass;
    }

    public void setExpirepass(String expirepass) {
        this.expirepass = expirepass;
    }

    public String getExpirepassbadconfirm() {
        return expirepassbadconfirm;
    }

    public void setExpirepassbadconfirm(String expirepassbadconfirm) {
        this.expirepassbadconfirm = expirepassbadconfirm;
    }

    public String getExpirepassbadnew() {
        return expirepassbadnew;
    }

    public void setExpirepassbadnew(String expirepassbadnew) {
        this.expirepassbadnew = expirepassbadnew;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    public String getIown() {
        return iown;
    }

    public void setIown(String iown) {
        this.iown = iown;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLoading() {
        return loading;
    }

    public void setLoading(String loading) {
        this.loading = loading;
    }

    public String getNewconfirm() {
        return newconfirm;
    }

    public void setNewconfirm(String newconfirm) {
        this.newconfirm = newconfirm;
    }

    public String getNewpasswd() {
        return newpasswd;
    }

    public void setNewpasswd(String newpasswd) {
        this.newpasswd = newpasswd;
    }

    public String getNoproject() {
        return noproject;
    }

    public void setNoproject(String noproject) {
        this.noproject = noproject;
    }

    public String getOldpasswd() {
        return oldpasswd;
    }

    public void setOldpasswd(String oldpasswd) {
        this.oldpasswd = oldpasswd;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getRecovery() {
        return recovery;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
class Out {

    @SerializedName("$")
    @Expose
    private String $;

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}
class SavedFilters {
}
class Tip {

    @SerializedName("$")
    @Expose
    private String $;

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}
class Tips {

    @SerializedName("tip")
    @Expose
    private Tip tip;

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

}
class Tparams {

    @SerializedName("func")
    @Expose
    private Func func;
    @SerializedName("out")
    @Expose
    private Out out;
    @SerializedName("username")
    @Expose
    private Username username;

    public Func getFunc() {
        return func;
    }

    public void setFunc(Func func) {
        this.func = func;
    }

    public Out getOut() {
        return out;
    }

    public void setOut(Out out) {
        this.out = out;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

}
class Username {

    @SerializedName("$")
    @Expose
    private String $;

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}