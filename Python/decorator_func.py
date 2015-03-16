import functools

def float_args_and_return(function):
    @functools.wraps(function)
    def wrapper(*args, **kwargs):
        args = [float(arg) for arg in args]
        return float(function(*args, **kwargs))
    return wrapper

@float_args_and_return
def mean(first, second, *rest):
    numbers = (first, second) + rest 
    return sum(numbers)/len(numbers)

def statically_typed(return_type = None, *types):
    def decorator(function):
        @functools.wraps(function)
        def wrapper(*args, **kwargs):
            if len(args) > len(types):
                raise ValueError("too many arguments")
            elif len(args) < len(types):
                raise ValueError("too few arguments")
            for i, (arg, type_) in enumerate(zip(args, types)):
                if not isinstance(arg, type_):
                    raise ValueError("argument {} must be of type {}".format(i ,   type_.__name__))
            result = function(*args, **kwargs)
            if (return_type is not None and not isinstance(result, return_type)):
                raise ValueError("return value must be of type {}".format(return_type.__name__))
            return result
        return wrapper
    return decorator
        