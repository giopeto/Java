(function($, NS, SuperClass,SubClass) {
	window[NS][SubClass] = window[NS][SubClass] || window[NS][SuperClass].extend({
	toString:function(){return NS + '.' + SubClass;},
    /** Constructor. */
    init : function(cfg) {
      this.bindBehavior(this);
    },
    /**
     * Binds client-side behavior.
     */
    bindBehavior : function() {
      $("#btnGetJson").click($.proxy(this.getJson,this));
    },
    /**
     * Logs the [x,y] coordinate where the mouse was clicked.
     */
    getJson : function(e) {
      var strTemplate=$("#txaTemplate").val(), 
          markup=[];
      
      $.ajax({
        url: "data/places.json",
        contentType: "application/json; charset=utf-8", /*send to server*/
        dataType: "json", /*expect from server*/
        success: function(data,xhr,status){
          $.each(data,function(){
            markup.push(strTemplate.tmpl(this));
          });
          $("#lstNames").html(markup.join(""));
        }
      });      
    }
  });

  /* Attach page specific behavior on page load */
  $(function() {
	  return new window[NS][SubClass]();
  });
}(jQuery, "SPS","Base","Page"));