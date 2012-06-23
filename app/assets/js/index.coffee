get_list = ()->
  $.ajax({
    url:"/list_aznables"
    success:(data) ->
      $("#loader").css("display","none")
      $.each data, (index, item) ->
        aznable ="<tr><td class='title_box'><a href='#{item.url}'>#{item.title}</a></td></tr>"
        $("#aznables > tbody").append aznable
    error:get_list
  })
get_list()
