from django.shortcuts import render

# Create your views here.
def student_form(request):
    if request.method =='POST':
        print("Form data sname:", request.POST['sname'])
        print("Form data name:", request.POST['name'])
    return render(request, 'students/student_form.html')