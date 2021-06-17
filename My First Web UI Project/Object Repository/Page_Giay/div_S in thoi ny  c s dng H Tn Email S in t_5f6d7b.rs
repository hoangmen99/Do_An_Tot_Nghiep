<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_S in thoi ny  c s dng H Tn Email S in t_5f6d7b</name>
   <tag></tag>
   <elementGuidId>26972279-b2af-4d24-be71-89a14fc8ed22</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='social-login-popup']/div[3]/div[2]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.col-md-8.box-login-right</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col-md-8 box-login-right</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> Số điện thoại này đã được sử dụng Họ Tên Email Số điện thoại   Mật khẩu Ẩn mật khẩu Hiện mật khẩuXác nhận mật khẩu Ẩn mật khẩu Hiện mật khẩuMật khẩu gồm 8-20 ký tự và không có khoảng trắng  Tôi đồng ý với Điều khoản / Điều kiện của Vina giầyĐăng ký Đăng ký bằng     
        require(['jquery'], function ($) {
            $('#social-login-authentication').removeClass('mp-12').addClass('mp-7');
        }); Bạn đã có tài khoản? Đăng nhập ngay tại đây
                    require([
                        'jquery',
                        'jquery/ui',
                        'mage/mage',
                        'jquery/validate',
                        'mage/translate'
                    ], function ($) {
                        $.validator.addMethod(
                            'validate-required', function (value) {
                                return (value !=='');
                            }, 'Đây là trường bắt buộc');
                        $.validator.addMethod(
                            'validate-custom-pass', function (value) {
                                return (value.length > 7 &amp;&amp; value.length &lt;21);
                            }, 'Mật khẩu gồm 8-20 ký tự và không có khoảng trắng');
                        $.validator.addMethod(
                            'validate-custom-phone', function (value) {
                                return (value.length >= 10 &amp;&amp; value.length &lt;= 15);
                            }, 'Vui lòng nhập số điện thoại hợp lệ');
                        $.validator.addMethod(
                            'validate-white-space', function (value) {
                                return (!/\s/.test(value));
                            }, 'Mật khẩu gồm 8-20 ký tự và không có khoảng trắng');
                        $.validator.addMethod(
                            'validate-custom-email', function (value) {
                                return (/^([a-z0-9,!\#\$%&amp;'\*\+\/=\?\^_`\{\|\}~-]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z0-9,!\#\$%&amp;'\*\+\/=\?\^_`\{\|\}~-]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*@([a-z0-9-]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z0-9-]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*\.(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]){2,})$/i.test(value));
                            }, 'Email không hợp lệ');
                        var dataForm = $('#social-form-create'),
                            ignore = null;

                        dataForm.mage('validation', {
                                                        ignore: ignore ? ':hidden:not(' + ignore + ')' : ':hidden'
                             });
                    });</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;social-login-popup&quot;)/div[@class=&quot;social-login block-container create&quot;]/div[@class=&quot;col-md-8 box-login-right&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='social-login-popup']/div[3]/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Đăng nhập bằng'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Chưa có tài khỏan?'])[1]/following::div[5]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
